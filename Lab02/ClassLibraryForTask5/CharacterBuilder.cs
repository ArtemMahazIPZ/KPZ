using System;
using System.Collections.Generic;

public abstract class CharacterBuilder
{
    protected Character character;

    public Character Character
    {
        get { return character; }
    }

    public abstract CharacterBuilder SetName(string name);
    public abstract CharacterBuilder SetHeight(double height);
    public abstract CharacterBuilder SetBuild(string build);
    public abstract CharacterBuilder SetHairColor(string hairColor);
    public abstract CharacterBuilder SetEyeColor(string eyeColor);
    public abstract CharacterBuilder SetClothing(string clothing);
    public abstract CharacterBuilder SetInventory(List<string> inventory);
}
