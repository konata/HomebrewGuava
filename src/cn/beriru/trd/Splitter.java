package cn.beriru.trd;

import java.util.List;

import com.tencent.qqmail.trd.commonslang.StringUtils;

public class Splitter{
	
	private String mOn;
	private boolean mOmitEmpty = false;
	private boolean mTrimResult = false;
	
	
	private Splitter(String on){
		mOn = on;
	}
	
	public static Splitter on(String on){
		return new Splitter(on);
	}
	
	public Splitter omitEmptyStrings(){
		mOmitEmpty = true;
		return this;
	}
	
	public Splitter trimResults(){
		mTrimResult = true;
		return this;
	}
	
	public List<String> split(String str){
		String[] sList = StringUtils.split(str,mOn);
		List<String> ret = Lists.newArrayList();
		for(String s : sList){
			if(!(mOmitEmpty || mTrimResult) || !StringUtils.isEmpty(s)){
				ret.add(s);
			}
		}
		return ret;
	}
	
	
}