/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.InputStream;

public interface BinaryStoreService {
	
	public boolean exists(String key) throws BinaryStoreServiceException;
	
	public String put(InputStream is) throws BinaryStoreServiceException;
	
	public InputStream get(String key) throws BinaryStoreServiceException, BinaryStreamNotFoundException;

}
