package Enums;

public enum PageElements {
	
	// Main Tabs
	TAB_SEARCH 	        ( "searchTab"				        ),
	TAB_ASSOC			( "associationsTab"			        ),
	TAB_INGEST 			( "ingestTab"				        ),
	TAB_RESEARCH        ( "researchTab"				        ),
	TAB_PROCESS			( "processTab"				        ),
	TAB_RUNDOWN         ( "rundownTab"				        ),
	TAB_LOG             ( "logTab"                          ),
	TAB_PUBLISH         ( "publishTab"                      ),          
	TAB_MCDPST          ( "mcdpStatusTab" 			        ),
	
	// Search Options Interface
	PILL_DDAW			( "searchPillDropDownArrow"         ),
	PILL_XQUIT          ( "searchPillXQuit"                 ),
	
	// Search Options
	SEARCH_ANY          ( "searchSettingAny"                ),
	SEARCH_META         ( "searchSettingMetadata"           ),
	SEARCH_NAME         ( "searchSettingName"               ),
	SEARCH_PHON         ( "searchSettingPhonetic"           ),
	SEARCH_MRK_SGM      ( "searchSettingMarkersAndSegments" ),
	SEARCH_CRTD         ( "searchCreated"                   ),
	SEARCH_MORE         ( "searchMoreButton"                );
	

	
	private String value;
	
	private PageElements (String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
}
