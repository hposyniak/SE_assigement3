package designpat.websearch;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes! " + query);
            }
        }, new PolicyObject(){
            @Override
            public boolean accept(String query) {
                if (query.toLowerCase().contains("fiend")) {
                    System.out.println();
                    return true;
                }
                return false;
            }
        });
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long....!" + query);
            }
        }, new PolicyObject(){
            @Override
    public boolean accept(String query) {
        if (query.length() > 60) {
            return true;
        }
        return false;
    }
        });

    }
}
