package io.yupiik.kubernetes.bindings.v1_9_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_9_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_10.Validable;
import io.yupiik.kubernetes.bindings.v1_9_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class GitRepoVolumeSource implements Validable<GitRepoVolumeSource>, Exportable {
    private String directory;
    private String repository;
    private String revision;

    public GitRepoVolumeSource() {
        // no-op
    }

    public GitRepoVolumeSource(final String directory,
                               final String repository,
                               final String revision) {
        // no-op
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(final String directory) {
        this.directory = directory;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(final String repository) {
        this.repository = repository;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(final String revision) {
        this.revision = revision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                directory,
                repository,
                revision);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GitRepoVolumeSource)) {
            return false;
        }
        final GitRepoVolumeSource __otherCasted = (GitRepoVolumeSource) __other;
        return Objects.equals(directory, __otherCasted.directory) &&
            Objects.equals(repository, __otherCasted.repository) &&
            Objects.equals(revision, __otherCasted.revision);
    }

    public GitRepoVolumeSource directory(final String directory) {
        this.directory = directory;
        return this;
    }

    public GitRepoVolumeSource repository(final String repository) {
        this.repository = repository;
        return this;
    }

    public GitRepoVolumeSource revision(final String revision) {
        this.revision = revision;
        return this;
    }

    @Override
    public GitRepoVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (repository == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "repository", "repository",
                "Missing 'repository' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (directory != null ? "\"directory\":\"" +  JsonStrings.escapeJson(directory) + "\"" : ""),
                    (repository != null ? "\"repository\":\"" +  JsonStrings.escapeJson(repository) + "\"" : ""),
                    (revision != null ? "\"revision\":\"" +  JsonStrings.escapeJson(revision) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
