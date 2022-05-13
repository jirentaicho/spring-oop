package com.volkruss.deposit.infrastructure.repository.ordinary;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.volkruss.deposit.domain.entity.deposit.dormant.DormantDeposit;
import com.volkruss.deposit.domain.repository.dormant.DormantDsModel;
import com.volkruss.deposit.domain.repository.dormant.DormantRepository;

@Component
public class DormantRepositoryImpl implements DormantRepository{
	
	private Map<Integer, DormantDsModel> database = new HashMap<>();
	
	public DormantRepositoryImpl() {
		this.database.put(1, new DormantDsModel("御坂8912号", 1, 100, LocalDate.of(2002, 1, 1)));
		this.database.put(2, new DormantDsModel("御坂10031号", 2, 5000, LocalDate.of(1999, 10, 12)));
		this.database.put(3, new DormantDsModel("御坂10777号", 3, 300, LocalDate.of(2000, 11, 11)));
		this.database.put(4, new DormantDsModel("御坂19090号", 4, 1, LocalDate.of(2003, 6, 5)));
	}

	@Override
	public DormantDeposit findById(int id) {
		DormantDsModel dsModel = this.database.get(id);
		DormantDeposit deposit = new DormantDeposit(dsModel.accountName,dsModel.accountNumber);
		deposit.setAmount(dsModel.amount);
		deposit.setDormantDate(
				LocalDate.of(
						dsModel.dormantDate.getYear(), 
						dsModel.dormantDate.getMonth(),
						dsModel.dormantDate.getDayOfMonth()));
		return deposit;
	} 

}
