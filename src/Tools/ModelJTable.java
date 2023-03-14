package Tools;

import Entities.Acteur;
import Entities.Cinema;
import Entities.Film;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    // A compléter ici
    public void LoadCinemas(ArrayList<Cinema> desCinemas)
    {
        columns = new String[]{"Numero", "Nom"};
        rows = new Object[desCinemas.size()][2];
        int i = 0;

        for (Cinema cinema : desCinemas){
            rows[i][0] = cinema.getIdCinema();
            rows[i][1] = cinema.getNomCinema();
            i++;
        }
        fireTableChanged(null);
    }

    public void LoadFilms(ArrayList<Film> desFilms)
    {
        columns = new String[]{"Numero", "Nom"};
        rows = new Object[desFilms.size()][2];
        int i = 0;

        for (Film film : desFilms){
            rows[i][0] = film.getIdFilm();
            rows[i][1] = film.getNomFilm();
            i++;
        }
        fireTableChanged(null);
    }

    public void LoadActeurs(ArrayList<Acteur> desActeurs)
    {
        columns = new String[]{"Numero", "Nom", "Note"};
        rows = new Object[desActeurs.size()][3];
        int i = 0;

        for (Acteur acteur : desActeurs){
            rows[i][0] = acteur.getIdActeur();
            rows[i][1] = acteur.getNomActeur();
            rows[i][2] = acteur.getNoteActeur();
            i++;
        }
        fireTableChanged(null);
    }


}
