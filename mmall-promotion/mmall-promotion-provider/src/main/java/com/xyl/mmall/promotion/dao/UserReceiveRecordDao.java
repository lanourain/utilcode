/*
 * @(#) 2014-11-19
 *
 * Copyright 2014 Netease, Inc. All rights reserved.
 */
package com.xyl.mmall.promotion.dao;

import com.netease.print.daojar.dao.AbstractDao;
import com.xyl.mmall.promotion.meta.UserReceiveRecord;

/**
 * UserReceiveRecordDao.java
 *
 * @author     <A HREF="mailto:hzruanhy@corp.netease.com">Roy</A>
 * @version    1.0 2014-11-19
 * @since      1.0
 */
public interface UserReceiveRecordDao extends AbstractDao<UserReceiveRecord> {

	UserReceiveRecord getUserReceiveRecord(long userId, long redPacketId, long groupId);

}
