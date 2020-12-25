package base.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import base.dao.CustomerDao;
import base.po.Customer;
import base.service.CustomerService;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	//注解注入CustomerDao
	@Autowired
	private CustomerDao customerDao;
	//查询客户
	public Customer findCustomerById(Integer id) {
		return this.customerDao.findCustomerById(id);
	}
}
