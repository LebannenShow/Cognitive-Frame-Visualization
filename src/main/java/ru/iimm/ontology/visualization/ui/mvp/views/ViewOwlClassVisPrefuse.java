package ru.iimm.ontology.visualization.ui.mvp.views;

import ru.iimm.ontology.visualization.ui.mvp.presenters.PresenterOwlClassPrefuse;

/**
 * View с Cajun визуализацией иерархии OWLClass'ов.
 * @author Danilov
 * @version 0.1
 */
public interface ViewOwlClassVisPrefuse extends ViewVis
{
	void setPresenter(PresenterOwlClassPrefuse presenter);
	PresenterOwlClassPrefuse getPresenter();
}
