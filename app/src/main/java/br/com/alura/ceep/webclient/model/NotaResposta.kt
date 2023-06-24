package br.com.alura.ceep.webclient.model

import br.com.alura.ceep.model.Nota
import java.util.UUID

class NotaResposta(
    val id: String?,
    val titulo: String?,
    val descricao: String?,
    val imagem: String?
) {
    //Converte NotaResposta para NotaApp
    val nota: Nota
        get() = Nota(
            id = id ?: UUID.randomUUID().toString(),
            titulo = titulo ?: "",
            descricao = descricao ?: "",
            imagem = imagem ?: ""
        )
}