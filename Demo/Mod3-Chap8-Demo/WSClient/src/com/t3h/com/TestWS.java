package com.t3h.com;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.t3h.com.TinhToanStub.TinhTong;
import com.t3h.com.TinhToanStub.TinhTongResponse;

public class TestWS {

	public static void main(String[] args) {
		try {
			TinhToanStub tinhToanStub = new TinhToanStub();
			
			TinhTong tinhTong = new TinhTong();
			tinhTong.setA(1);
			tinhTong.setB(2);
			
			TinhTongResponse tinhTongResponse = tinhToanStub.tinhTong(tinhTong);
			
			System.out.println(tinhTongResponse.get_return());
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
