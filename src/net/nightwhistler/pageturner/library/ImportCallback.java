package net.nightwhistler.pageturner.library;

import java.util.List;

public interface ImportCallback {

	void importComplete( int booksImported, List<String> failures, boolean emptyLibrary );
	
	void importStatusUpdate( String update );
		
	void importFailed( String reason );
	
	void importCancelled();
	
}
