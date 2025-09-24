class ConcatinationMethod{
	public static void main(String... e){
		String s = "Hey, ";
		System.out.println(s.concat("How are you?").concat(":)"));
	}
}

//there will be 5 objects will be created and double quotation ke andar wali string har baar ek nya object bnayega that is 3 to ye or concat method ke 2 object banege

// ye 3 string scp me ek object bnate hai or 2 runtime me object bnenege (s.concat("How are you?")) ek nya objecgt banyega same issi tarah se ek or "Hey, How are you?".concat(":) ")