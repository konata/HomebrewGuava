package cn.beriru.trd;


public interface Function<Input,Return> {
	public Return apply(Input input);
}
