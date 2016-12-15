package com.t3h.frms;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class NoHeaderObjectOutputStream extends ObjectOutputStream {
	public NoHeaderObjectOutputStream(OutputStream os) throws IOException {
		super(os);
	}

	protected void writeStreamHeader() {
		// khong ghi header vao file
	}
}