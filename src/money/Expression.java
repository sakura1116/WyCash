package money;

interface Expression {
	Expression times(int Expression);

	Expression plus(Expression addend);

	Money reduce(Bank bank, String to);
}
