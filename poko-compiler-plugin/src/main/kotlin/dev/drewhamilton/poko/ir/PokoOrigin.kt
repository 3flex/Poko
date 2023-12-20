package dev.drewhamilton.poko.ir

import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin

internal object PokoOrigin : IrDeclarationOrigin {
    override val name: String = "GENERATED_POKO_CLASS_MEMBER"
}
