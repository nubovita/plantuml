package net.sourceforge.plantuml.eclipse.utils;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 * Functionality for generating diagrams from contents of active editors,
 * optionally based on editor selection
 * @author hal
 *
 */
public interface DiagramTextProvider {

	/**
	 * Tells if the specified editor (or its input) is supported
	 * @param editorPart
	 * @return true if the specified editor (or its input) is supported, false otherwise
	 */
	public boolean supportsEditor(IEditorPart editorPart);

	/**
	 * Tells whether the specified editor selection is supported
	 * @param selection
	 * @return true if the specified editor selection is supported, false otherwise
	 */
	public boolean supportsSelection(ISelection selection);

	/**
	 * Computes the diagram text for the specific editor part and selection
	 * @param editorPart
	 * @param selection
	 * @return the corresponding diagram text
	 */
	public String getDiagramText(IEditorPart editorPart, ISelection selection);
}
