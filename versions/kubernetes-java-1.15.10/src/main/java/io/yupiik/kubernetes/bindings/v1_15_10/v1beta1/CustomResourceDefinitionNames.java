package io.yupiik.kubernetes.bindings.v1_15_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_10.Validable;
import io.yupiik.kubernetes.bindings.v1_15_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionNames implements Validable<CustomResourceDefinitionNames> {
    private List<String> categories;
    private String kind;
    private String listKind;
    private String plural;
    private List<String> shortNames;
    private String singular;

    public CustomResourceDefinitionNames() {
        // no-op
    }

    public CustomResourceDefinitionNames(final List<String> categories,
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
        if (!(__other instanceof CustomResourceDefinitionNames)) {
            return false;
        }
        final CustomResourceDefinitionNames __otherCasted = (CustomResourceDefinitionNames) __other;
        return Objects.equals(categories, __otherCasted.categories) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(listKind, __otherCasted.listKind) &&
            Objects.equals(plural, __otherCasted.plural) &&
            Objects.equals(shortNames, __otherCasted.shortNames) &&
            Objects.equals(singular, __otherCasted.singular);
    }

    public CustomResourceDefinitionNames categories(final List<String> categories) {
        this.categories = categories;
        return this;
    }

    public CustomResourceDefinitionNames kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CustomResourceDefinitionNames listKind(final String listKind) {
        this.listKind = listKind;
        return this;
    }

    public CustomResourceDefinitionNames plural(final String plural) {
        this.plural = plural;
        return this;
    }

    public CustomResourceDefinitionNames shortNames(final List<String> shortNames) {
        this.shortNames = shortNames;
        return this;
    }

    public CustomResourceDefinitionNames singular(final String singular) {
        this.singular = singular;
        return this;
    }

    @Override
    public CustomResourceDefinitionNames validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (kind == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kind", "kind",
                "Missing 'kind' attribute.", true));
        }
        if (plural == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "plural", "plural",
                "Missing 'plural' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
