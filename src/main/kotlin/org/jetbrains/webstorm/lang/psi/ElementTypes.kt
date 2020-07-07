package org.jetbrains.webstorm.lang.psi

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.psi.tree.IElementType
import org.jetbrains.webstorm.ide.icons.WebAssemblyIcons
import org.jetbrains.webstorm.lang.WebAssemblyLanguage
import javax.swing.Icon

class WebAssemblyTokenType(debugName: String) : IElementType(debugName, WebAssemblyLanguage) {
    override fun toString(): String = "WebAssemblerTokenType." + super.toString()
}

class WebAssemblyCompositeType(debugName: String) : IElementType(debugName, WebAssemblyLanguage)

object WebAssemblyFileType : LanguageFileType(WebAssemblyLanguage) {
    override fun getName(): String = "WebAssembly"
    override fun getDescription(): String = "WebAssembly file"
    override fun getDefaultExtension(): String = "wasm"

    override fun getIcon(): Icon = WebAssemblyIcons.WEB_ASSEMBLY_FILE
}