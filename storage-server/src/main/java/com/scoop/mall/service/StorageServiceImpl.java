package com.scoop.mall.service;

import com.scoop.mall.dao.StorageDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author scoop
 */
@Service("storageServiceImpl")
public class StorageServiceImpl implements StorageService {

	private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

	@Autowired
	private StorageDao storageDao;

	/**
	 * 扣减库存
	 *
	 * @param productId 产品id
	 * @param count     数量
	 * @return
	 */
	@Override
	public void decrease(Long productId, Integer count) {
		LOGGER.info("------->扣减库存开始");
		storageDao.decrease(productId, count);
		LOGGER.info("------->扣减库存结束");
	}
}
