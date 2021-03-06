package t;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Ajava {

	@Around("call(public java.net.InetAddress t.C.getAddress() throws java.net.UnknownHostException)")
	public InetAddress getAddress() throws UnknownHostException {
		return InetAddress.getLocalHost();
	}
}
