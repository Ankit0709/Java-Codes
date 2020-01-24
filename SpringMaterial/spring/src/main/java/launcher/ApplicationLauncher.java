package launcher;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import config.MyBeanFactory;

public class ApplicationLauncher extends
AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	public Class<?>[] getRootConfigClasses() {
		System.out.println(1);
		return null;
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		System.out.println(2);
		return new Class<?>[]{MyBeanFactory.class};
	}

	@Override
	public String[] getServletMappings() {
		System.out.println(3);
		return new String[]{"/"};
	}

}