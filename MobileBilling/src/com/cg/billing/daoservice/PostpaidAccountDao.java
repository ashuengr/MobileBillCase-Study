package com.cg.billing.daoservice;

import java.util.List;

import com.cg.billing.beans.PostpaidAccount;

public interface PostpaidAccountDao {
	PostpaidAccount save(PostpaidAccount posAccount);
	boolean update(PostpaidAccount posAccount);
	PostpaidAccount findOne(long mobileNo);
	List<PostpaidAccount> findAll();
}
