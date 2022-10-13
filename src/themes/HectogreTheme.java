package themes;

import com.formdev.flatlaf.FlatDarkLaf;

public class HectogreTheme extends FlatDarkLaf {
	public static final String NAME = "HectogreTheme";

	public static boolean setup() {
		return setup( new HectogreTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, HectogreTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
