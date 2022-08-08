package io.yupiik.kubernetes.bindings.v1_18_7.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop {
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                             final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                             final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
