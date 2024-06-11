package br.edu.up.daos;

import java.util.List;
import br.edu.up.models.Livro;

public interface LivroDAO {
    List<Livro> getAll();

    boolean saveAll(List<Livro> livros);
}
