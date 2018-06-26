package com.tjcsims.entity;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Assessments entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.tjcsims.entity.Assessments
 * @author MyEclipse Persistence Tools
 */
public class AssessmentsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(AssessmentsDAO.class);
	// property constants
	public static final String ASSESSMENTS_CONTENT = "assessmentsContent";
	public static final String ASSESSMENTS_REPLY = "assessmentsReply";
	public static final String ASSESSMENTS_TIME = "assessmentsTime";

	public void save(Assessments transientInstance) {
		log.debug("saving Assessments instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Assessments persistentInstance) {
		log.debug("deleting Assessments instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Assessments findById(java.lang.Integer id) {
		log.debug("getting Assessments instance with id: " + id);
		try {
			Assessments instance = (Assessments) getSession().get("com.tjcsims.entity.Assessments", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Assessments instance) {
		log.debug("finding Assessments instance by example");
		try {
			List results = getSession().createCriteria("com.tjcsims.entity.Assessments").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Assessments instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Assessments as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAssessmentsContent(Object assessmentsContent) {
		return findByProperty(ASSESSMENTS_CONTENT, assessmentsContent);
	}

	public List findByAssessmentsReply(Object assessmentsReply) {
		return findByProperty(ASSESSMENTS_REPLY, assessmentsReply);
	}

	public List findByAssessmentsTime(Object assessmentsTime) {
		return findByProperty(ASSESSMENTS_TIME, assessmentsTime);
	}

	public List findAll() {
		log.debug("finding all Assessments instances");
		try {
			String queryString = "from Assessments";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Assessments merge(Assessments detachedInstance) {
		log.debug("merging Assessments instance");
		try {
			Assessments result = (Assessments) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Assessments instance) {
		log.debug("attaching dirty Assessments instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Assessments instance) {
		log.debug("attaching clean Assessments instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}