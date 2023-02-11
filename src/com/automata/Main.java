package com.automata;

public class Main {

    //main() method starts
    public static void main(String[] args)
    {
        String generatedText = "The reference list of the journal is well organized and follows a consistent citation style (IEEE). " +
                "The references are primarily from conference proceedings and journal articles, which suggests that the authors have thoroughly searched for relevant literature in the field of smart grids and energy internet. " +
                "Overall, the reference list of the journal appears to be well-composed and showcases the author’s diligent research efforts. " +
                "However, to further improve the quality of the reference list, the authors could consider including a more diverse range of sources, such as books, technical reports, and grey literature, in addition to conference proceedings and journal articles.";
        String referencedText = "The reference list of the journal is well organized and follows a consistent citation style (IEEE). The references are primarily from conference proceedings and journal articles, which suggests that the authors have thoroughly searched for relevant literature in the field of smart grids and energy internet. The articles cited are recent and relevant to the topic of the journal, showcasing the authors’ effort to keep up-to-date with the latest research developments in the field. " +
                "The references also seem to cover a broad range of topics, from security challenges and solutions to energy management and optimization, demonstrating the authors’ comprehensive understanding of the subject matter. Additionally, the references are numbered and presented in chronological order, making it easier for readers to navigate through the list and locate specific articles. " +
                "Overall, the reference list of the journal appears to be well-composed and showcases the author’s diligent research efforts. However, to further improve the quality of the reference list, the authors could consider including a more diverse range of sources, such as books, technical reports, and grey literature, in addition to conference proceedings and journal articles.";

        RougeL rougeL = new RougeL(referencedText, generatedText);

        double score = rougeL.getRougeScore() * 100;

        System.out.println("Length of the Longest Common Subsequence is: "+ score + "%");
    }
}
