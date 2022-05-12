package com.volkruss.deposit.domain.repository.ordinary;

import com.volkruss.deposit.domain.entity.deposit.ordinary.OrdinaryDeposit;

public interface OrdinaryRepository {
	OrdinaryDeposit findById(int id);
}
