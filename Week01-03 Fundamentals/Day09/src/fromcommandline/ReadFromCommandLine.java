package fromcommandline;

import java.util.Arrays;

public class ReadFromCommandLine {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		assert args.length != 2 : "Args length equals 2";
	}
}
