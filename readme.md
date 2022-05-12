# 名前を付けてコンポーネントを登録する
	@Component("dormant")
	public final class DormantInitializeAction extends DepositInitializeAction{

# 名前を付けてＤＩする

	@Autowired
	@Qualifier("dormant")
	private DepositInitializeAction action;
	
