package com.tjcsims.entity;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tjcsims.dao.BaseHibernateDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Scores entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.tjcsims.entity.Scores
 * @author MyEclipse Persistence Tools
 */
public class ScoresDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(ScoresDAO.class);
	// property constants
	public static final String SCORES_TERM = "scoresTerm";
	public static final String SCORES_PEACETIME = "scoresPeacetime";
	public static final String SCORES_EXAMINATION = "scoresExamination";
	public static final String SCORES_TOTAL = "scoresTotal";

	public void save(Scores transientInstance) {
		log.debug("saving Scores instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Scores persistentInstance) {
		log.debug("deleting Scores instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Scores findById(java.lang.Integer id) {
		log.debug("getting Scores instance with id: " + id);
		try {
			Scores instance = (Scores) getSession().get("com.tjcsims.entity.Scores", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Scores instance) {
		log.debug("finding Scores instance by example");
		try {
			List results = getSession().createCriteria("com.tjcsims.entity.Scores").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Scores instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Scores as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByScoresTerm(Object scoresTerm) {
		return findByProperty(SCORES_TERM, scoresTerm);
	}

	public List findByScoresPeacetime(Object scoresPeacetime) {
		return findByProperty(SCORES_PEACETIME, scoresPeacetime);
	}

	public List findByScoresExamination(Object scoresExamination) {
		return findByProperty(SCORES_EXAMINATION, scoresExamination);
	}

	public List findByScoresTotal(Object scoresTotal) {
		return findByProperty(SCORES_TOTAL, scoresTotal);
	}

	public List findAll() {
		log.debug("finding all Scores instances");
		try {
			String queryString = "from Scores";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Scores merge(Scores detachedInstance) {
		log.debug("merging Scores instance");
		try {
			Scores result = (Scores) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Scores instance) {
		log.debug("attaching dirty Scores instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Scores instance) {
		log.debug("attaching clean Scores instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}