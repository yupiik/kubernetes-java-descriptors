package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumes {
    private DeploymentSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private DeploymentSpecTemplateSpecVolumesAzureDisk azureDisk;
    private DeploymentSpecTemplateSpecVolumesAzureFile azureFile;
    private DeploymentSpecTemplateSpecVolumesCephfs cephfs;
    private DeploymentSpecTemplateSpecVolumesCinder cinder;
    private DeploymentSpecTemplateSpecVolumesConfigMap configMap;
    private DeploymentSpecTemplateSpecVolumesCsi csi;
    private DeploymentSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private DeploymentSpecTemplateSpecVolumesEmptyDir emptyDir;
    private DeploymentSpecTemplateSpecVolumesFc fc;
    private DeploymentSpecTemplateSpecVolumesFlexVolume flexVolume;
    private DeploymentSpecTemplateSpecVolumesFlocker flocker;
    private DeploymentSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private DeploymentSpecTemplateSpecVolumesGitRepo gitRepo;
    private DeploymentSpecTemplateSpecVolumesGlusterfs glusterfs;
    private DeploymentSpecTemplateSpecVolumesHostPath hostPath;
    private DeploymentSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private DeploymentSpecTemplateSpecVolumesNfs nfs;
    private DeploymentSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private DeploymentSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private DeploymentSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private DeploymentSpecTemplateSpecVolumesProjected projected;
    private DeploymentSpecTemplateSpecVolumesQuobyte quobyte;
    private DeploymentSpecTemplateSpecVolumesRbd rbd;
    private DeploymentSpecTemplateSpecVolumesScaleIO scaleIO;
    private DeploymentSpecTemplateSpecVolumesSecret secret;
    private DeploymentSpecTemplateSpecVolumesStorageos storageos;
    private DeploymentSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public DeploymentSpecTemplateSpecVolumes() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumes(final DeploymentSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                             final DeploymentSpecTemplateSpecVolumesAzureDisk azureDisk,
                                             final DeploymentSpecTemplateSpecVolumesAzureFile azureFile,
                                             final DeploymentSpecTemplateSpecVolumesCephfs cephfs,
                                             final DeploymentSpecTemplateSpecVolumesCinder cinder,
                                             final DeploymentSpecTemplateSpecVolumesConfigMap configMap,
                                             final DeploymentSpecTemplateSpecVolumesCsi csi,
                                             final DeploymentSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                             final DeploymentSpecTemplateSpecVolumesEmptyDir emptyDir,
                                             final DeploymentSpecTemplateSpecVolumesFc fc,
                                             final DeploymentSpecTemplateSpecVolumesFlexVolume flexVolume,
                                             final DeploymentSpecTemplateSpecVolumesFlocker flocker,
                                             final DeploymentSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                             final DeploymentSpecTemplateSpecVolumesGitRepo gitRepo,
                                             final DeploymentSpecTemplateSpecVolumesGlusterfs glusterfs,
                                             final DeploymentSpecTemplateSpecVolumesHostPath hostPath,
                                             final DeploymentSpecTemplateSpecVolumesIscsi iscsi,
                                             final String name,
                                             final DeploymentSpecTemplateSpecVolumesNfs nfs,
                                             final DeploymentSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                             final DeploymentSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                             final DeploymentSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                             final DeploymentSpecTemplateSpecVolumesProjected projected,
                                             final DeploymentSpecTemplateSpecVolumesQuobyte quobyte,
                                             final DeploymentSpecTemplateSpecVolumesRbd rbd,
                                             final DeploymentSpecTemplateSpecVolumesScaleIO scaleIO,
                                             final DeploymentSpecTemplateSpecVolumesSecret secret,
                                             final DeploymentSpecTemplateSpecVolumesStorageos storageos,
                                             final DeploymentSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final DeploymentSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public DeploymentSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final DeploymentSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public DeploymentSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final DeploymentSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public DeploymentSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final DeploymentSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public DeploymentSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final DeploymentSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public DeploymentSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final DeploymentSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public DeploymentSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final DeploymentSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public DeploymentSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DeploymentSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public DeploymentSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final DeploymentSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public DeploymentSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final DeploymentSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public DeploymentSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final DeploymentSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public DeploymentSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final DeploymentSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public DeploymentSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final DeploymentSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public DeploymentSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final DeploymentSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public DeploymentSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final DeploymentSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public DeploymentSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final DeploymentSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public DeploymentSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final DeploymentSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DeploymentSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final DeploymentSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public DeploymentSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final DeploymentSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public DeploymentSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final DeploymentSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public DeploymentSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final DeploymentSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public DeploymentSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final DeploymentSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public DeploymentSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final DeploymentSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public DeploymentSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final DeploymentSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public DeploymentSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final DeploymentSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public DeploymentSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final DeploymentSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public DeploymentSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final DeploymentSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public DeploymentSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final DeploymentSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumes)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumes __otherCasted = (DeploymentSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
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
