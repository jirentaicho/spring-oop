package com.volkruss.deposit.domain.repository.dormant;

import com.volkruss.deposit.domain.entity.deposit.dormant.DormantDeposit;

public interface DormantRepository {
	DormantDeposit findById(int id);
}
