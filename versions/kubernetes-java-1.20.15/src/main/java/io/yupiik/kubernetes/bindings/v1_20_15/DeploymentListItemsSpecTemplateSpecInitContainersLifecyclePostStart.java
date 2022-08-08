package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart {
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                               final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                               final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
