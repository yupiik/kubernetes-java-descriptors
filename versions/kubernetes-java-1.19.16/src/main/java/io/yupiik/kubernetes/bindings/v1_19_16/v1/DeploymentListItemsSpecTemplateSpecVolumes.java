package io.yupiik.kubernetes.bindings.v1_19_16.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumes {
    private DeploymentListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private DeploymentListItemsSpecTemplateSpecVolumesAzureDisk azureDisk;
    private DeploymentListItemsSpecTemplateSpecVolumesAzureFile azureFile;
    private DeploymentListItemsSpecTemplateSpecVolumesCephfs cephfs;
    private DeploymentListItemsSpecTemplateSpecVolumesCinder cinder;
    private DeploymentListItemsSpecTemplateSpecVolumesConfigMap configMap;
    private DeploymentListItemsSpecTemplateSpecVolumesCsi csi;
    private DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private DeploymentListItemsSpecTemplateSpecVolumesEmptyDir emptyDir;
    private DeploymentListItemsSpecTemplateSpecVolumesEphemeral ephemeral;
    private DeploymentListItemsSpecTemplateSpecVolumesFc fc;
    private DeploymentListItemsSpecTemplateSpecVolumesFlexVolume flexVolume;
    private DeploymentListItemsSpecTemplateSpecVolumesFlocker flocker;
    private DeploymentListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private DeploymentListItemsSpecTemplateSpecVolumesGitRepo gitRepo;
    private DeploymentListItemsSpecTemplateSpecVolumesGlusterfs glusterfs;
    private DeploymentListItemsSpecTemplateSpecVolumesHostPath hostPath;
    private DeploymentListItemsSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private DeploymentListItemsSpecTemplateSpecVolumesNfs nfs;
    private DeploymentListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private DeploymentListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private DeploymentListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private DeploymentListItemsSpecTemplateSpecVolumesProjected projected;
    private DeploymentListItemsSpecTemplateSpecVolumesQuobyte quobyte;
    private DeploymentListItemsSpecTemplateSpecVolumesRbd rbd;
    private DeploymentListItemsSpecTemplateSpecVolumesScaleIO scaleIO;
    private DeploymentListItemsSpecTemplateSpecVolumesSecret secret;
    private DeploymentListItemsSpecTemplateSpecVolumesStorageos storageos;
    private DeploymentListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public DeploymentListItemsSpecTemplateSpecVolumes() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumes(final DeploymentListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesAzureDisk azureDisk,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesAzureFile azureFile,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesCephfs cephfs,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesCinder cinder,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesConfigMap configMap,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesCsi csi,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesEmptyDir emptyDir,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesEphemeral ephemeral,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesFc fc,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesFlexVolume flexVolume,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesFlocker flocker,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesGitRepo gitRepo,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesGlusterfs glusterfs,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesHostPath hostPath,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesIscsi iscsi,
                                                      final String name,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesNfs nfs,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesProjected projected,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesQuobyte quobyte,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesRbd rbd,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesScaleIO scaleIO,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesSecret secret,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesStorageos storageos,
                                                      final DeploymentListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final DeploymentListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final DeploymentListItemsSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final DeploymentListItemsSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final DeploymentListItemsSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final DeploymentListItemsSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final DeploymentListItemsSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final DeploymentListItemsSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DeploymentListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final DeploymentListItemsSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesEphemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(final DeploymentListItemsSpecTemplateSpecVolumesEphemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final DeploymentListItemsSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final DeploymentListItemsSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final DeploymentListItemsSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final DeploymentListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final DeploymentListItemsSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final DeploymentListItemsSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final DeploymentListItemsSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final DeploymentListItemsSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final DeploymentListItemsSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final DeploymentListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final DeploymentListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final DeploymentListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final DeploymentListItemsSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final DeploymentListItemsSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final DeploymentListItemsSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final DeploymentListItemsSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final DeploymentListItemsSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final DeploymentListItemsSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final DeploymentListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                ephemeral,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumes)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumes __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(ephemeral, __otherCasted.ephemeral) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
