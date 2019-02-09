package cn.sxt.shiro;

import org.apache.shiro.SecurityUtils;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

public class AuthenShiro {
	public static void main(String[] args) {
		Factory<SecurityManager> factory=new IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","1111");
		try {
			subject.login(token);
		
			if(subject.isAuthenticated()){
				System.out.println("��¼�ɹ�");
			}
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		System.out.println("�û��������벻��ȷ");
		}
			
			
	}
}
