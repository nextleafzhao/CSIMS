package com.tjcsims.entity;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tjcsims.dao.BaseHibernateDAO;

/**
 	* A data access object (DAO) providing persistence and search support for Students entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.tjcsims.entity.Students
  * @author MyEclipse Persistence Tools 
 */
public class StudentsDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(StudentsDAO.class);
		//property constants
	public static final String STUDENTS_PASSWD = "studentsPasswd";
	public static final String STUDENTS_NAME = "studentsName";
	public static final String STUDENTS_SEX = "studentsSex";
	public static final String STUDENTS_BIRTHDAY = "studentsBirthday";
	public static final String STUDENTS_ADDRESS = "studentsAddress";
	public static final String STUDENTS_TEL = "studentsTel";
	public static final String STUDENTS_BEGIN_YEAR = "studentsBeginYear";



    
    public void save(Students transientInstance) {
        log.debug("saving Students instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Students persistentInstance) {
        log.debug("deleting Students instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Students findById( java.lang.Integer id) {
        log.debug("getting Students instance with id: " + id);
        try {
            Students instance = (Students) getSession()
                    .get("com.tjcsims.entity.Students", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Students instance) {
        log.debug("finding Students instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.tjcsims.entity.Students")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Students instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Students as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByStudentsPasswd(Object studentsPasswd
	) {
		return findByProperty(STUDENTS_PASSWD, studentsPasswd
		);
	}
	
	public List findByStudentsName(Object studentsName
	) {
		return findByProperty(STUDENTS_NAME, studentsName
		);
	}
	
	public List findByStudentsSex(Object studentsSex
	) {
		return findByProperty(STUDENTS_SEX, studentsSex
		);
	}
	
	public List findByStudentsBirthday(Object studentsBirthday
	) {
		return findByProperty(STUDENTS_BIRTHDAY, studentsBirthday
		);
	}
	
	public List findByStudentsAddress(Object studentsAddress
	) {
		return findByProperty(STUDENTS_ADDRESS, studentsAddress
		);
	}
	
	public List findByStudentsTel(Object studentsTel
	) {
		return findByProperty(STUDENTS_TEL, studentsTel
		);
	}
	
	public List findByStudentsBeginYear(Object studentsBeginYear
	) {
		return findByProperty(STUDENTS_BEGIN_YEAR, studentsBeginYear
		);
	}
	

	public List findAll() {
		log.debug("finding all Students instances");
		try {
			String queryString = "from Students";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Students merge(Students detachedInstance) {
        log.debug("merging Students instance");
        try {
            Students result = (Students) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Students instance) {
        log.debug("attaching dirty Students instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Students instance) {
        log.debug("attaching clean Students instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}