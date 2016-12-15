package com.t3h.demo;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Demo {

	public static void main(String[] args) {
		//docXML();
		
		// ghiXML();
		
		demoXPath();
	}

	private static void demoXPath() {
		
		// http://www.w3schools.com/xml/xml_xpath.asp
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("data2.xml"));
			
			XPath xPath = XPathFactory.newInstance().newXPath();
			String path = "/bookstore/book[2]/title";
			String path2 = "/bookstore/book[@category='cooking']/title/@lang";
			String path3 = "//title";
			
			//Element el = (Element) xPath.compile(path).evaluate(document, XPathConstants.NODE);
			//System.out.println(el.getTextContent());
			
			//String lang = xPath.compile(path2).evaluate(document);
			//System.out.println(lang);
			
			NodeList nodeList  = (NodeList) xPath.compile(path3).evaluate(document, XPathConstants.NODESET);
			
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println(nodeList.item(i).getTextContent());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void ghiXML() {
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			
			File file = new File("data3.xml");
			
			Document document = null;
			
			if(file.exists()){
				document = builder.parse(file);
			} else {
				document = builder.newDocument();
			}
			
			Element root = document.getDocumentElement();
			
			if(root == null){
				root = document.createElement("not_goc");
				root.setAttribute("abc", "xyz");
				document.appendChild(root);
			}
			
			Element nodeCon = document.createElement("not_con");
			nodeCon.setAttribute("ten", "Toi la not con");
			nodeCon.setAttribute("tuoi", "10");
			nodeCon.setTextContent("Day la text content");
			
			root.appendChild(document.createTextNode("\n\t"));
			root.appendChild(nodeCon);
			
			
			
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(new DOMSource(document), new StreamResult(file));
			
			System.out.println("Xong");
			
		
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void docXML() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("data.xml"));
			
			Element root = document.getDocumentElement();
			
			System.out.println(root.getNodeName());
			System.out.println(root.getAttribute("test"));
			
			NodeList nlNV = root.getElementsByTagName("nhan_vien");
			
			for (int i = 0; i < nlNV.getLength(); i++) {
				Element nv = (Element) nlNV.item(i);
				NodeList nlHT = nv.getElementsByTagName("ho_ten");
				Element ht = (Element) nlHT.item(0);
				System.out.println(ht.getTextContent());
			}
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
