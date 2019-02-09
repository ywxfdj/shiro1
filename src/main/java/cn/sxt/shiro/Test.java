package cn.sxt.shiro;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Test {
	public static void main(String[] args) {
		String pwd=new Md5Hash("1111").toHex();
     System.out.println(pwd);
     String pwd1=new Md5Hash("1111").toString();
     System.out.println(pwd1);
	}
}
