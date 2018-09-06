package JavaPracticeExamplesDataTypes;

public class JavaDataTypesChar {

	public static void main(String[] args) {
//char ch = null; Type mismatch: cannot convert from null to char
	}

}

//char
//	* old languages like c or c++ are ascii code based and no of diff ascii characters are less than or equal to 256
//	* to represent this 256 characters 8 bits are enough, hence size of char is 1 byte
//	* but java is unicode based, and no of diff unicode char are > 256 and < 65536
//	* to represent these many char 8 bits not enough, hence we should go for 16bits
//	* hence size of char is 2 bytes
//	* 0 to 65536

//Summay of JAVA primitive data types:
//	
//	datatype	size	range						wrapperclass 	default value
//	byte		1 byte	-128 to 127					byte			0
//	short		2		-32768 to 32767				short			0
//	int 		4		-2147483648 to 2147483647	int				0
//	long		8		-2^63 to 2^63-1				long			0
//	float 		4		-3.4e38 to 3.4e38			float			0.0
//	double		8		-1.7e38 to 1.7e38			double			0.0	
//	boolean		na		na							boolean			false
//	char		2		0 to 65536					char			0(represents space character)
//	
//- null is default value for object reference type and we can't apply for primitives if we are trying to use for prmitive then will get compile time error

	
	