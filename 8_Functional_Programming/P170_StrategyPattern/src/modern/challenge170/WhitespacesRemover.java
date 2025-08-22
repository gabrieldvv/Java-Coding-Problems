package modern.challenge170;

public class WhitespacesRemover implements RemoveStrategy {

    @Override
    public String execute(String s) {
        return s.replaceAll("\\s", "");
    }

}
