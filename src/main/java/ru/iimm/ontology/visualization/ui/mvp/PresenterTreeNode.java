package ru.iimm.ontology.visualization.ui.mvp;

import javax.swing.event.TreeSelectionEvent;

/**
 * Описывает поведение для Presenter-а для TreeNode.
 * @author Danilov
 * @version 0.1
 */
public interface PresenterTreeNode
{
	/**
	 * Получает выделенный элемент из дерава.
	 * @param event - выделенный элемент.
	 */
	void selectedTreeNode(TreeSelectionEvent event);
	/**
	 * Обновляет режим выбора.
	 */
	void updateSelectionMode();
	/**
	 * Обновляет рендер для элементов дерева.
	 */
	void updateCellRenderer();
	/**
	 * Обновляет содержимое дерева из модели.
	 */
	void updateTreeNodeFromModel();
	ViewTreeNode getView();
	void setView(ViewTreeNode view);
}
