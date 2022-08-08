package io.yupiik.kubernetes.bindings.v1_13_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionSpecNames {
    private List<String> categories;
    private String kind;
    private String listKind;
    private String plural;
    private List<String> shortNames;
    private String singular;

    public CustomResourceDefinitionSpecNames() {
        // no-op
    }

    public CustomResourceDefinitionSpecNames(final List<String> categories,
                                             final String kind,
                                             final String listKind,
                                             final String plural,
                                             final List<String> shortNames,
                                             final String singular) {
        // no-op
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(final List<String> categories) {
        this.categories = categories;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getListKind() {
        return listKind;
    }

    public void setListKind(final String listKind) {
        this.listKind = listKind;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(final String plural) {
        this.plural = plural;
    }

    public List<String> getShortNames() {
        return shortNames;
    }

    public void setShortNames(final List<String> shortNames) {
        this.shortNames = shortNames;
    }

    public String getSingular() {
        return singular;
    }

    public void setSingular(final String singular) {
        this.singular = singular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                categories,
                kind,
                listKind,
                plural,
                shortNames,
                singular);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionSpecNames)) {
            return false;
        }
        final CustomResourceDefinitionSpecNames __otherCasted = (CustomResourceDefinitionSpecNames) __other;
        return Objects.equals(categories, __otherCasted.categories) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(listKind, __otherCasted.listKind) &&
            Objects.equals(plural, __otherCasted.plural) &&
            Objects.equals(shortNames, __otherCasted.shortNames) &&
            Objects.equals(singular, __otherCasted.singular);
    }
}
