package poker.AI.strategy.impl;

import poker.AI.CardCombinations;
import poker.AI.strategy.Strategy;
import poker.AI.valueobjects.Action;
import poker.AI.valueobjects.Response;

public class Pair3Awesome extends Strategy {

	@Override
	public Action apply(Response r) {
		if(CardCombinations.quantityOfPairs(r)==2&&r.getCallAmount()/getAdjustedStack(r)<0.3)
		{
			return new Action("raise",(int)Math.round(getAdjustedStack(r)*0.075));
		}else if(CardCombinations.qtySameColor(r)==5&&r.getCallAmount()/getAdjustedStack(r)<0.9){
			return new Action("raise",(int)Math.round(getAdjustedStack(r)*0.15));
		}
		else if(r.getCommunityCards().length==0&&CardCombinations.isPairOrMore(r)==2){
			return new Action("raise",(int)(r.getStack()*0.01));
		}else if(r.getCommunityCards().length==0){
			return new Action("raise",0);
		}else if(CardCombinations.isPairOrMore(r)==2&&r.getCallAmount()/getAdjustedStack(r)<0.05)
		{
			return new Action("raise",(int)Math.round(getAdjustedStack(r)*0.01));
		}else if(CardCombinations.isPairOrMore(r)==3&&r.getCallAmount()/getAdjustedStack(r)<0.1)
		{
			return new Action("raise",(int)Math.round(getAdjustedStack(r)*0.05));
		}else if(CardCombinations.isPairOrMore(r)==4&&r.getCallAmount()/getAdjustedStack(r)<0.1)
		{
			return new Action("raise",r.getStack());
		}else if(r.getCallAmount()>0.005*getAdjustedStack(r)){
			return new Action("fold",0);
		}
		return new Action("raise",0);
	}

	private double getAdjustedStack(Response r){
		return r.getStack()+r.getCurrentBet();
	}
	

}
