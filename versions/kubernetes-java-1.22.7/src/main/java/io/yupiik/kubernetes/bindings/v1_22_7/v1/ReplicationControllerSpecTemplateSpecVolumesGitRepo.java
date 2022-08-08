package io.yupiik.kubernetes.bindings.v1_22_7.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesGitRepo {
    private String directory;
    private String repository;
    private String revision;

    public ReplicationControllerSpecTemplateSpecVolumesGitRepo() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesGitRepo(final String directory,
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesGitRepo)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesGitRepo __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesGitRepo) __other;
        return Objects.equals(directory, __otherCasted.directory) &&
            Objects.equals(repository, __otherCasted.repository) &&
            Objects.equals(revision, __otherCasted.revision);
    }
}
