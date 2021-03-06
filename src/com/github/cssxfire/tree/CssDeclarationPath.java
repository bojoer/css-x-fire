/*
 * Copyright 2010 Ronnie Kolehmainen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.cssxfire.tree;

/**
 * Created by IntelliJ IDEA.
 * User: Ronnie
 */
public class CssDeclarationPath {
    private final CssTreeNode[] treeNodes;

    public CssDeclarationPath(CssDirectoryNode directoryNode, CssFileNode fileNode, CssSelectorNode selectorNode, CssDeclarationNode declarationNode) {
        this.treeNodes = new CssTreeNode[] {directoryNode, fileNode, selectorNode, declarationNode};
    }

    public CssTreeNode[] getPathFromRoot() {
        return treeNodes;
    }

    public CssDirectoryNode getDirectoryNode() {
        return (CssDirectoryNode) treeNodes[0];
    }

    public CssFileNode getFileNode() {
        return (CssFileNode) treeNodes[1];
    }

    public CssSelectorNode getSelectorNode() {
        return (CssSelectorNode) treeNodes[2];
    }

    public CssDeclarationNode getDeclarationNode() {
        return (CssDeclarationNode) treeNodes[3];
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " ['" + getFileNode().getVirtualFile()
                + "', '" + getSelectorNode().getSelector()
                + "', '" + getDeclarationNode().getPropertyName() + "']";
    }
}
