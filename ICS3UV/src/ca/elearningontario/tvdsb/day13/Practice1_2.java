package ca.elearningontario.tvdsb.day13;

public class Practice1_2 {

	public static void main(String[] args) {
		String[] Prime_Ministers = { "Sir John Alexander Macdonald (1867–73; 1st time)",
				"Alexander Mackenzie (1873–78)", "Sir John Alexander Macdonald (1878–91; 2nd time)",
				"Sir John Abbott (1891–92)", "Sir John Thompson (1892–94)", "Sir Mackenzie Bowell (1894–96)",
				"Sir Charles Tupper, 1st Baronet (1896)", "Sir Wilfrid Laurier (1896–1911)",
				"Sir Robert Laird Borden (1911–20)", "Arthur Meighen (1920–21; 1st time)",
				"W.L. Mackenzie King (1921–26; 1st time)", "Arthur Meighen (1926; 2nd time)",
				"W.L. Mackenzie King (1926–30; 2nd time)", "Richard Bedford Bennett (1930–35)",
				"W.L. Mackenzie King (1935–48; 3rd time)", "Louis Saint Laurent (1948–57)",
				"John G. Diefenbaker (1957–63)", "Lester B. Pearson (1963–68)",
				"Pierre Elliott Trudeau (1968–79; 1st time)", "Joe Clark (1979–80)",
				"Pierre Elliott Trudeau (1980–84; 2nd time)", "John N. Turner (1984)", "Brian Mulroney (1984–93)",
				"Kim Campbell (1993)", "Jean Chrétien (1993–2003)", "Paul Martin (2003–06)", "Stephen Harper (2006–15)",
				"Justin Trudeau (2015– )" };
		
		for (int i = Prime_Ministers.length - 1; i >= 0; i--) {
			System.out.println(Prime_Ministers[i]);
		}
		
	}

}
