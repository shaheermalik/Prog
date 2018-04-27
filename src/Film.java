public class Film {

    private String nameOfFilm;

    private String nameOfDirector;

    private int yearOfRelease;



    public Film(String nameOfFilm, String nameOfDirector, int yearOfRelease) {

        this.nameOfFilm = nameOfFilm.toUpperCase();

        this.nameOfDirector = nameOfDirector.toUpperCase();

        this.yearOfRelease = yearOfRelease;

    }



    public String getNameOfFilm() {

        return nameOfFilm;

    }





    public String getNameOfDirector() {

        return nameOfDirector;

    }





    public int getYearOfRelease() {



        return yearOfRelease;

    }



    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Film)) return false;



        Film film = (Film) o;



        if (getYearOfRelease() != film.getYearOfRelease()) return false;

        if (!getNameOfFilm().equals(film.getNameOfFilm())) return false;

        return getNameOfDirector().equals(film.getNameOfDirector());

    }



    @Override

    public int hashCode() {

        int result = getNameOfFilm().hashCode();

        result = 31 * result + getNameOfDirector().hashCode();

        result = 31 * result + getYearOfRelease();

        return result;

    }

}