package databaseutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entity_onetomany.PersonDetail;
import entity_onetomany.course;
public class dbutil {
	private static SessionFactory factory;

	public static Session getSession() {
		factory = new AnnotationConfiguration()
				.configure()
				.addAnnotatedClass(PersonDetail.class)
				.addAnnotatedClass(course.class)
				.buildSessionFactory();
		
		return factory.openSession();
	}
}
