package com.tjcsims.entity;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TeachersCopy entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.tjcsims.entity.TeachersCopy
 * @author MyEclipse Persistence Tools
 */
public class TeachersCopyDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TeachersCopyDAO.class);
	// property constants
	public static final String FACULTIES_ID = "facultiesId";
	public static final String TEACHERS_PASSWD = "teachersPasswd";
	public static final String TEACHERS_NAME = "teachersName";
	public static final String TEACHERS_SEX = "teachersSex";
	public static final String TEACHERS_BIRTHDAY = "teachersBirthday";
	public static final String TEACHERS_EMAIL = "teachersEmail";
	public static final String REMARKS = "remarks";

	public void save(TeachersCopy transientInstance) {
		log.debug("saving TeachersCopy instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TeachersCopy persistentInstance) {
		log.debug("deleting TeachersCopy instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TeachersCopy findById(java.lang.Integer id) {
		log.debug("getting TeachersCopy instance with id: " + id);
		try {
			TeachersCopy instance = (TeachersCopy) getSession().get("com.tjcsims.entity.TeachersCopy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TeachersCopy instance) {
		log.debug("finding TeachersCopy instance by example");
		try {
			List results = getSession().createCriteria("com.tjcsims.entity.TeachersCopy").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TeachersCopy instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TeachersCopy as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFacultiesId(Object facultiesId) {
		return findByProperty(FACULTIES_ID, facultiesId);
	}

	public List findByTeachersPasswd(Object teachersPasswd) {
		return findByProperty(TEACHERS_PASSWD, teachersPasswd);
	}

	public List findByTeachersName(Object teachersName) {
		return findByProperty(TEACHERS_NAME, teachersName);
	}

	public List findByTeachersSex(Object teachersSex) {
		return findByProperty(TEACHERS_SEX, teachersSex);
	}

	public List findByTeachersBirthday(Object teachersBirthday) {
		return findByProperty(TEACHERS_BIRTHDAY, teachersBirthday);
	}

	public List findByTeachersEmail(Object teachersEmail) {
		return findByProperty(TEACHERS_EMAIL, teachersEmail);
	}

	public List findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List findAll() {
		log.debug("finding all TeachersCopy instances");
		try {
			String queryString = "from TeachersCopy";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TeachersCopy merge(TeachersCopy detachedInstance) {
		log.debug("merging TeachersCopy instance");
		try {
			TeachersCopy result = (TeachersCopy) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TeachersCopy instance) {
		log.debug("attaching dirty TeachersCopy instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TeachersCopy instance) {
		log.debug("attaching clean TeachersCopy instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}