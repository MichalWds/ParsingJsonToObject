package booksapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.appengine.repackaged.com.google.protos.gdata.proto2api.Core;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RunBooksDemo {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Books books = objectMapper.readValue(new File("F:\\Projekty\\booksApi\\src\\test\\resources\\books.json"), Books.class);

            printParseObject(books);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printParseObject(Books books) {
        printBooksInfo(books.getRequestedUrl());
        System.out.println();
        printItems(books.getItems());

    }

    private static void printBooksInfo(String books) {
    }

    private static void printPageInfo(Core.PageInfo aas) {
        Books books1 = new Books();
        System.out.println("Print url");
        System.out.println("URL   :   + " + books1.getRequestedUrl());
        System.out.println("items: ");
    }


    private static void printItems(List<ItemsItem> items) {
        System.out.println("Items");
        System.out.println("...");

        for (ItemsItem item : items) {
            printPost(item);
        }

    }

    private static void printPost(ItemsItem itemsItem) {
        System.out.println("\tKind                   :   " + itemsItem.getKind());
        //  System.out.println("\t Id                  :     " + itemsItem.getId(isbn));
        System.out.println("\tetag  : "                     + itemsItem.getEtag());
        System.out.println("\tselfink : "                        + itemsItem.getSelfLink());
        System.out.println("\tvolumeInfo                   : " + itemsItem.getVolumeInfo().getCategories());
        System.out.println("\tsalesinfo               : " + itemsItem.getSaleInfo());
        System.out.println("\taccesInfo                  : " + itemsItem.getAccessInfo());
        System.out.println("\tsearchInfo            : " + itemsItem.getSearchInfo());

    }
}

