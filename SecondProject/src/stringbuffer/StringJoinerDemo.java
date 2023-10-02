package stringbuffer;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerDemo {

	/*
	 * public StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence
	 * suffix) StringJoiner is used to construct a sequence of characters separated
	 * by a delimiter and optionally starting with a supplied prefix and ending with
	 * a supplied suffix. Non Synchronized add() not thread safe String Builder
	 * Append() Synchronized and thread safe. *
	 * 
	 */

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(",", "[", "]");

		sj1.add("Parker").add("Coco").add("DuoDuo").add("Amao");

		System.out.println(sj1.toString());
		System.out.println();
		StringJoiner sj2 = new StringJoiner(":", "*", "*");

		sj2.add("Lucky").add("Ellie").add("Emma");

		System.out.println(sj2.toString());
		System.out.println();
		StringJoiner merge = sj1.merge(sj2);
		System.out.println(merge.toString());

	}

}
